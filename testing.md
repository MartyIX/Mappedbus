# Testing 


Writer:

```
./gradlew fatJar && java -cp build/libs/mappedBus-0.5-SNAPSHOT-all.jar io.mappedbus.sample.object.ObjectWriter 2
```

Reader:

```
./gradlew fatJar && java -cp build/libs/mappedBus-0.5-SNAPSHOT-all.jar io.mappedbus.sample.object.ObjectReader
```