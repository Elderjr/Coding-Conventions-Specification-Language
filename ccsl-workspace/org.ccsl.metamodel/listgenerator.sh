#!/bin/bash
egrep 'EClass|eSubpackage' model/ccsl.ecore | awk  '{ if($1=="<eClassifiers") { gsub(/name=/,"",$3); print $3;} else print $2; }'
