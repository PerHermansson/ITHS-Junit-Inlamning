#
# Makefile
#
# Torgny Lyon <torgny@abc.se>
#

rapport.pdf: rapport.ps
	ps2pdf rapport.ps $@

rapport.ps: rapport
	troff rapport | grops > $@

clean:
	-rm -f rapport.pdf rapport.ps
