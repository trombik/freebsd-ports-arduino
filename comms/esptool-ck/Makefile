# Created by: Tomoyuki Sakurai <y@trombik.org>

PORTNAME=	esptool-ck
DISTVERSION=	0.4.13
CATEGORIES=	comms

MAINTAINER=	y@trombik.org
COMMENT=	Tool to create firmware files for the ESP8266 chip

LICENSE=	GPLv2
LICENSE_FILE=	${WRKSRC}/LICENSE

USES=	gmake
USE_GITHUB=	yes

GH_ACCOUNT=	igrr
MAKE_ARGS+=	VERSION=${DISTVERSION}

do-install:
	${INSTALL_PROGRAM} ${WRKSRC}/esptool ${STAGEDIR}${PREFIX}/bin/

.include <bsd.port.mk>
