##### GENERAL ######
exec { 'apt-update':
  command   => 'sudo apt-get update',
  path      => [ '/bin/', '/sbin/' , '/usr/bin/', '/usr/sbin/' ],
}

package { 'language-pack-en':
  ensure => present,
}


##### END GENERAL #####


###### Java Installer (Thanks Oracle for making this so easy!) #####

include apt

apt::ppa { 'ppa:webupd8team/java': }

package { 'oracle-java7-installer':
  ensure   => present,
  require  => [Apt::Ppa['ppa:webupd8team/java'], Exec['apt-update'], Exec['set-licence-selected'], Exec['set-licence-seen']],
}

exec {
  'set-licence-selected':
  command => '/bin/echo debconf shared/accepted-oracle-license-v1-1 select true | /usr/bin/debconf-set-selections';

  'set-licence-seen':
  command => '/bin/echo debconf shared/accepted-oracle-license-v1-1 seen true | /usr/bin/debconf-set-selections';
}


##### END JAVA INSTALLER ######

##### POSTGRESQL #####

class { 'postgresql::server':
  ip_mask_deny_postgres_user    => '0.0.0.0/32',
  ip_mask_allow_all_users       => '0.0.0.0/0',
  listen_addresses              => '*',
  manage_firewall               => true,
}

postgresql::server::role { 'potentialJooqBugCustomTypesMockJDBC':
  password_hash => postgresql_password('potentialJooqBugCustomTypesMockJDBC', 'potentialJooqBugCustomTypesMockJDBC'),
}

postgresql::server::db { 'potentialJooqBugCustomTypesMockJDBC':
  user      => 'potentialJooqBugCustomTypesMockJDBC',
  password  => postgresql_password('potentialJooqBugCustomTypesMockJDBC', 'potentialJooqBugCustomTypesMockJDBC'),
}


##### END POSTGRESQL ######

##### NTP ######
include '::ntp'

##### END NTP ######
