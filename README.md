# meta-starfive-bsp
OE/Yocto layer for Starfive VisionFive V1 board

## Quick Start
### Poky Environment
```text
mkdir yocto && cd yocto
git clone git://git.yoctoproject.org/poky.git
git clone https://github.com/openembedded/meta-openembedded.git poky/meta-openembedded
git clone https://github.com/limingle/meta-starfive-bsp.git poky/meta-starfive-bsp
```

### OpenEmbedded Environment
```text
mkdir yocto && cd yocto
git clone https://github.com/openembedded/openembedded-core.git openembedded
git clone https://github.com/openembedded/bitbake.git openembedded/bitbake
git clone https://github.com/openembedded/meta-openembedded.git openembedded/meta-openembedded
git clone https://github.com/limingle/meta-starfive-bsp.git openembedded/meta-starfive-bsp
```

### Poky Build
```text
cd yocto
export TEMPLATECONF=meta-starfive-bsp/conf
source poky/oe-init-build-env build
MACHINE=starfive-visionfive-jh7100 bitbake core-image-minimal
```

### OpenEmbedded Build
```text
cd yocto
export TEMPLATECONF=meta-starfive-bsp/conf
source openembedded/oe-init-build-env build
MACHINE=starfive-visionfive-jh7100 bitbake core-image-minimal
```

## Use Repo
Make sure to [install the `repo` command by Google](https://source.android.com/setup/downloading#installing-repo) first.

you can use [`repo-in-docker`](https://github.com/limingle/repo-in-docker) for convenience

### Poky Environment
```text
mkdir yocto && yocto
repo init -u https://github.com/limingle/yocto-manifests -m starfive-yocto.xml [-b honister]
repo sync
```

### OpenEmbedded Environment
```text
mkdir yocto && yocto
repo init -u https://github.com/limingle/yocto-manifests -m starfive-oe.xml [-b kirkstone]
repo sync
```
