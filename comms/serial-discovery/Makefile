PORTNAME=	serial-discovery
DISTVERSION=	1.2.1
CATEGORIES=	comms

MAINTAINER=	y@trombik.org
COMMENT=	Arduino IDE pluggable-discovery for Serial ports

LICENSE=	GPLv3
LICENSE_FILE=	${WRKSRC}/LICENSE.txt

USES=	go:modules
USE_GITHUB=	yes
GH_ACCOUNT=	arduino
GH_TAGNAME=	v${DISTVERSION}
AUTO_GH_TUPLE=       \
	arduino:go-paths-helper:v1.5.0:arduino_go_paths_helper/vendor/github.com/arduino/go-paths-helper \
	arduino:go-properties-orderedmap:v1.4.0:arduino_go_properties_orderedmap/vendor/github.com/arduino/go-properties-orderedmap \
	creack:goselect:v0.1.2:creack_goselect/vendor/github.com/creack/goselect \
	golang:sys:77cc2087c03b:golang_sys/vendor/golang.org/x/sys \
	pkg:errors:v0.9.1:pkg_errors/vendor/github.com/pkg/errors \
	s-urbaniak:uevent:v1.0.0:s_urbaniak_uevent/vendor/github.com/s-urbaniak/uevent

	# Mirrors for the following packages are not currently known,
	# please look them up and handle these tuples manually:
	# ::v1.1.3:group_name/vendor/go.bug.st/serial

MANUAL_GH_TUPLE=	\
	bugst:go-serial:v1.1.3:bugst_go_serial/vendor/go.bug.st/serial

GH_TUPLE=	${AUTO_GH_TUPLE} ${MANUAL_GH_TUPLE}

post-patch:
	${CP} ${WRKSRC}/sync_darwin.go ${WRKSRC}/sync_freebsd.go

.include <bsd.port.mk>
