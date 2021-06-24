# `devel/arduino-cli`

A CLI tool to build Arduino sketches.

## Status

* Alpha. It works with some hacks on local machine
* Compiles a simple Blink example for AVR

```console
> pwd
/home/trombik/foo
> tree -d .
.
├── packages
│   └── builtin
│       └── tools
│           ├── ctags
│           │   └── 5.8-arduino11 -> /usr/local/arduino/tools-builder/ctags/5.8-arduino11
│           └── serial-discovery
│               └── 1.2.1
└── staging
```

```console
> arduino-cli compile -b arduino:avr:uno --build-property "compiler.path = /usr/local/arduino/tools-builder/avr-gcc/4.9.2-atmel3.5.4-arduino2/bin/" -v
```
