#!/usr/bin/env bash

##
## Release Steps For new Annotation Support Library Version
##

export KANNOT_HOME="/d/projects/misc/kscript-annotations";

trim() { while read -r line; do echo "$line"; done; }
annot_version=$(grep '^version' ${KANNOT_HOME}/build.gradle | cut -f3 -d' ' | tr -d "'" | trim)

echo "new version is $annot_version"

### Do the github release
## see https://github.com/aktau/github-release

#source /Users/brandl/archive/gh_token.sh
source ~/archive/gh_token.sh
export GITHUB_TOKEN=${GH_TOKEN}
#echo $GITHUB_TOKEN

# make your tag and upload
cd ${KANNOT_HOME}

## make sure we have not pending commits
(git diff --ignore-submodules --exit-code && git tag "v${annot_version}")  || echo "could not tag current branch"

## make sure all local changes become public
git push --tags

# check the current tags and existing releases of the repo
# binaries are located under $GOPATH/bin
export PATH=~/go/bin/:$PATH

github-release info -u holgerbrandl -r kscript-annotations

# create a formal release
github-release release \
    --user holgerbrandl \
    --repo kscript-annotations \
    --tag "v${annot_version}" \
    --name "v${annot_version}" \
    --description "See [NEWS.md](https://github.com/holgerbrandl/kscript/blob/master/NEWS.md) for changes."
#    --pre-release


########################################################################
### Build and publish the binary release to jcenter

gradle install

# careful with this one!
gradle bintrayUpload
