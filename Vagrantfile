
Vagrant.configure("2") do |config|
  config.vm.box = "hashicorp/bionic64"
  config.vm.provision "file", source: "DumbAPI", destination: "$HOME/"
  config.vm.provision :shell, path: "docker.sh"
  config.vm.provision :shell, path: "run_dumbapi.sh"
end
