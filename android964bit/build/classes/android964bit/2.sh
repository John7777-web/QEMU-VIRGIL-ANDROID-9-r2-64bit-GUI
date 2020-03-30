#!/bin/sh
qemu-virgil \
-enable-kvm \
-m 6000 \
-smp 2 \
-cpu host \
-soundhw ac97 \
-device virtio-vga,virgl=on -display sdl,gl=on \
-serial mon:stdio \
-boot menu=on \
-hda /home/$USER/Documents/androidfresh.vdi  \
-nic user,model=virtio-net-pci
-net nic,model=virtio -net tap,if=tap0
