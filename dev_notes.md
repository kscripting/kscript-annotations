# How to publish a new version?

```bash
# cd /d/projects/misc/kscript_annotations
 
./gradlew jar

./gradlew publishToMavenLocal

#./gradlew publishToSonatype closeSonatypeStagingRepository
./gradlew publishToSonatype closeAndReleaseSonatypeStagingRepository
```