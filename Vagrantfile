Vagrant.configure("2") do |config|
#    config.vm.network "private_network", ip: "10.128.128.128"
    config.vm.network "forwarded_port", guest: 5432, host: 5432
end

Vagrant::Config.run do |config|
    config.vm.provision "puppet" do |puppet|
        puppet.manifests_path = "puppet/manifest"
        puppet.module_path = "puppet/modules"
        puppet.options = "--verbose --debug"
    end

  config.vm.box = "raring64"
  config.vm.box_url = "http://cloud-images.ubuntu.com/vagrant/raring/current/raring-server-cloudimg-amd64-vagrant-disk1.box"
end
