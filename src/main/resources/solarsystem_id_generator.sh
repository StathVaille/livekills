#!/usr/bin/env bash

# Extracts the solar system Ids for a specific region from the Eve Static Data Export.
# SDE can be downloaded from https://developers.eveonline.com/resource/resources

cd sde/fsd/universe/eve/Catch
grep -R "solarSystemID" . | cut -d "/" -f 3,4 | sed "s|/[^ ]*||g" | sed "s/ /,/g" > Catch_ids.csv