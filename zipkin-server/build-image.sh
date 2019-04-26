#!/usr/bin/env bash

now=`date +%Y%m%d%H%M`
# https://git-scm.com/docs/git-log
git_version=`git log -1 --pretty=%h`