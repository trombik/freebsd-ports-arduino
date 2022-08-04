PORTNAME=	arduino-cli
DISTVERSION=	0.25.1
CATEGORIES=	devel

MAINTAINER=	y@trombik.org
COMMENT=	Arduino command line tool

LICENSE=	GPLv3
LICENSE_FILE=	${WRKSRC}/LICENSE.txt

RUN_DEPENDS=	\
	serial-discovery:comms/serial-discovery \
	arduino-builder:devel/arduino-builder

USES=	go:modules

USE_GITHUB=	yes
GH_ACCOUNT= arduino

AUTO_GH_TUPLE=	\
	arduino:board-discovery:1ba29327fb0c:arduino_board_discovery/vendor/github.com/arduino/board-discovery \
	arduino:go-paths-helper:v1.7.0:arduino_go_paths_helper/vendor/github.com/arduino/go-paths-helper \
	arduino:go-properties-orderedmap:v1.6.0:arduino_go_properties_orderedmap/vendor/github.com/arduino/go-properties-orderedmap \
	arduino:go-timeutils:d1dd9e313b1b:arduino_go_timeutils/vendor/github.com/arduino/go-timeutils \
	arduino:go-win32-utils:ed041402e83b:arduino_go_win32_utils/vendor/github.com/arduino/go-win32-utils \
	bugst:go-serial:5f7892a7bb45:bugst_go_serial/vendor/go.bug.st/serial.v1 \
	cmaglie:easyjson:v0.8.1:cmaglie_easyjson/vendor/github.com/mailru/easyjson \
	cmaglie:easyjson:v0.8.1:cmaglie_easyjson_1/vendor/github.com/mailru/easyjson \
	cmaglie:pb:v1.0.27:cmaglie_pb/vendor/github.com/cmaglie/pb \
	codeclysm:cc:v1.2.2:codeclysm_cc/vendor/github.com/codeclysm/cc \
	codeclysm:extract:v3.0.2:codeclysm_extract/vendor/github.com/codeclysm/extract/v3 \
	cpuguy83:go-md2man:v2.0.0:cpuguy83_go_md2man/vendor/github.com/cpuguy83/go-md2man/v2 \
	creack:goselect:v0.1.2:creack_goselect/vendor/github.com/creack/goselect \
	davecgh:go-spew:v1.1.1:davecgh_go_spew/vendor/github.com/davecgh/go-spew \
	djherbis:buffer:v1.1.0:djherbis_buffer/vendor/github.com/djherbis/buffer \
	djherbis:nio:v3.0.1:djherbis_nio/vendor/github.com/djherbis/nio/v3 \
	emirpasic:gods:v1.12.0:emirpasic_gods/vendor/github.com/emirpasic/gods \
	fatih:color:v1.7.0:fatih_color/vendor/github.com/fatih/color \
	fluxio:iohelpers:3a4dd67a94d2:fluxio_iohelpers/vendor/github.com/fluxio/iohelpers \
	fluxio:multierror:9c68d39025e5:fluxio_multierror/vendor/github.com/fluxio/multierror \
	fsnotify:fsnotify:v1.4.9:fsnotify_fsnotify/vendor/github.com/fsnotify/fsnotify \
	go-ini:ini:v1.62.0:go_ini_ini/vendor/gopkg.in/ini.v1 \
	go-mgo:mgo:9856a29383ce:go_mgo_mgo/vendor/gopkg.in/mgo.v2 \
	go-warnings:warnings:v0.1.2:go_warnings_warnings/vendor/gopkg.in/warnings.v0 \
	go-yaml:yaml:496545a6307b:go_yaml_yaml/vendor/gopkg.in/yaml.v3 \
	go-yaml:yaml:v2.4.0:go_yaml_yaml_1/vendor/gopkg.in/yaml.v2 \
	gofrs:uuid:v3.2.0:gofrs_uuid/vendor/github.com/gofrs/uuid \
	golang:crypto:75b288015ac9:golang_crypto/vendor/golang.org/x/crypto \
	golang:net:0287a6fb4125:golang_net/vendor/golang.org/x/net \
	golang:protobuf:v1.5.2:golang_protobuf/vendor/github.com/golang/protobuf \
	golang:sys:63515b42dcdf:golang_sys/vendor/golang.org/x/sys \
	golang:text:v0.3.6:golang_text/vendor/golang.org/x/text \
	google:go-genproto:f16073e35f0c:google_go_genproto/vendor/google.golang.org/genproto \
	grpc:grpc-go:v1.38.0:grpc_grpc_go/vendor/google.golang.org/grpc \
	h2non:filetype:v1.0.8:h2non_filetype/vendor/github.com/h2non/filetype \
	hashicorp:hcl:v1.0.0:hashicorp_hcl/vendor/github.com/hashicorp/hcl \
	inconshreveable:mousetrap:v1.0.0:inconshreveable_mousetrap/vendor/github.com/inconshreveable/mousetrap \
	jbenet:go-context:d14ea06fba99:jbenet_go_context/vendor/github.com/jbenet/go-context \
	josharian:intern:v1.0.0:josharian_intern/vendor/github.com/josharian/intern \
	juju:errors:089d3ea4e4d5:juju_errors/vendor/github.com/juju/errors \
	juju:loggo:6e530bcce5d8:juju_loggo/vendor/github.com/juju/loggo \
	kevinburke:ssh_config:01f96b0aa0cd:kevinburke_ssh_config/vendor/github.com/kevinburke/ssh_config \
	konsorten:go-windows-terminal-sequences:v1.0.1:konsorten_go_windows_terminal_sequences/vendor/github.com/konsorten/go-windows-terminal-sequences \
	kr:text:v0.2.0:kr_text/vendor/github.com/kr/text \
	leonelquinteros:gotext:v1.4.0:leonelquinteros_gotext/vendor/github.com/leonelquinteros/gotext \
	magiconair:properties:v1.8.5:magiconair_properties/vendor/github.com/magiconair/properties \
	marcinbor85:gohex:55fb1c624d84:marcinbor85_gohex/vendor/github.com/marcinbor85/gohex \
	mattn:go-colorable:v0.1.8:mattn_go_colorable/vendor/github.com/mattn/go-colorable \
	mattn:go-isatty:v0.0.12:mattn_go_isatty/vendor/github.com/mattn/go-isatty \
	mattn:go-runewidth:v0.0.9:mattn_go_runewidth/vendor/github.com/mattn/go-runewidth \
	miekg:dns:v1.1.43:miekg_dns/vendor/github.com/miekg/dns \
	mitchellh:go-homedir:v1.1.0:mitchellh_go_homedir/vendor/github.com/mitchellh/go-homedir \
	mitchellh:mapstructure:v1.4.1:mitchellh_mapstructure/vendor/github.com/mitchellh/mapstructure \
	oleksandr:bonjour:5dcf00d8b228:oleksandr_bonjour/vendor/github.com/oleksandr/bonjour \
	pelletier:go-toml:v1.9.3:pelletier_go_toml/vendor/github.com/pelletier/go-toml \
	pkg:errors:v0.9.1:pkg_errors/vendor/github.com/pkg/errors \
	pmezard:go-difflib:v1.0.0:pmezard_go_difflib/vendor/github.com/pmezard/go-difflib \
	pmylund:sortutil:abeda66eb583:pmylund_sortutil/vendor/github.com/pmylund/sortutil \
	rifflock:lfshook:b9218ef580f5:rifflock_lfshook/vendor/github.com/rifflock/lfshook \
	russross:blackfriday:v2.0.1:russross_blackfriday/vendor/github.com/russross/blackfriday/v2 \
	schollz:closestmatch:v2.1.0:schollz_closestmatch/vendor/github.com/schollz/closestmatch \
	sergi:go-diff:v1.1.0:sergi_go_diff/vendor/github.com/sergi/go-diff \
	shurcooL:sanitized_anchor_name:v1.0.0:shurcool_sanitized_anchor_name/vendor/github.com/shurcooL/sanitized_anchor_name \
	sirupsen:logrus:v1.4.2:sirupsen_logrus/vendor/github.com/sirupsen/logrus \
	spf13:afero:v1.6.0:spf13_afero/vendor/github.com/spf13/afero \
	spf13:cast:v1.3.1:spf13_cast/vendor/github.com/spf13/cast \
	spf13:cobra:v1.2.1:spf13_cobra/vendor/github.com/spf13/cobra \
	spf13:jwalterweatherman:v1.1.0:spf13_jwalterweatherman/vendor/github.com/spf13/jwalterweatherman \
	spf13:pflag:v1.0.5:spf13_pflag/vendor/github.com/spf13/pflag \
	spf13:viper:v1.8.1:spf13_viper/vendor/github.com/spf13/viper \
	src-d:gcfg:v1.4.0:src_d_gcfg/vendor/github.com/src-d/gcfg \
	src-d:go-billy:v4.3.2:src_d_go_billy/vendor/gopkg.in/src-d/go-billy.v4 \
	src-d:go-git:v4.13.1:src_d_go_git/vendor/gopkg.in/src-d/go-git.v4 \
	stretchr:testify:v1.7.0:stretchr_testify/vendor/github.com/stretchr/testify \
	subosito:gotenv:v1.2.0:subosito_gotenv/vendor/github.com/subosito/gotenv \
	xanzy:ssh-agent:v0.2.1:xanzy_ssh_agent/vendor/github.com/xanzy/ssh-agent

MANUAL_GH_TUPLE=	\
	bugst:go-cleanup:v1.0.0:bugst_go_cleanup/vendor/go.bug.st/cleanup \
	bugst:relaxed-semver:v0.9.0:bugst_relaxed_semver/vendor/go.bug.st/relaxed-semver \
	bugst:go-serial:v1.3.2:bugst_go_serial/vendor/go.bug.st/serial \
	bugst:go-serial:5f7892a7bb45:bugst_go_serial_v1/vendor/go.bug.st/serial.v1 \
	bugst:go-downloader:v2.1.1:bugst_go_downloader/vendor/go.bug.st/downloader/v2 \
	protocolbuffers:protobuf-go:v1.26.0:protocolbuffers_protobuf_go/vendor/google.golang.org/protobuf

GH_TUPLE=	${AUTO_GH_TUPLE} ${MANUAL_GH_TUPLE}

post-patch:
	${CP} ${WRKSRC}/executils/executils_linux.go ${WRKSRC}/executils/executils_freebsd.go
	${CP} ${WRKSRC}/i18n/detect_linux.go ${WRKSRC}/i18n/detect_freebsd.go

.include <bsd.port.mk>
