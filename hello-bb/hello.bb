S = "../hello-prj"
SRC_URI = "file:///dev/null"

do_build () {
  mkdir -p ${S}/build 
  cd ${S}/build
  make -f ../Makefile
}
