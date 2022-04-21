This demo Yocto meta-layer aims to demonstrate how Yocto and other build tools such as Makefile, Autotools, and Cmake can complement each other. Finally, it also shows how to install these applications on the result rootfs.

* * * * * * * * *

# /recipes-helloworld

There are 3 sample applications in /recipes-helloworld, helloworld-mf, helloworld-at, helloworld-cm, that are built by Makefile, Autotools, and Cmake, correspondingly. They can be built separately without Yocto.

Then, the 3 .bb files describe how to convert them into recipes. "helloworld-mf" is straightforward, just simply invoked Yocto's wrapper of "make". The author must take care of the details of Makefile.

"helloworld-at" 's recipe is simpler due to the class of Autotools can offer most of the dirty work. The key is below code,

```
inherit autotools
```

This will tell our recipe to reuse autotools class. The details refer to 'recipes-helloworld/helloworld-at/helloworld-at.bb"

"helloworld-cm" is the same case with Autotools's version of recipe. The only difference is to inherit Cmake class,

```
inherit cmake
```
* * * * * * * * *

# /recipes-sato

/recipes-sato is a sample that extends the existing sato image, and installs helloworld-mf, helloworld-at and helloworld-cm on rootfs. 

* * * * * * * * *

# Feedback

Let's [me](mailto:kai.han@nio.com) know your thoughts and feedback. 

