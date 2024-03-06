Kata Starter Kotlin
==

This repository aims to provide the simplest setup to start a Kata exercise.
Both in terms of library and configuration.

## Troubleshoot

If the tests are not running correctly, please refer to
this [post](https://intellij-support.jetbrains.com/hc/en-us/community/posts/360006656399-Run-JUnit-test-from-within-class-test-NOT-GRADLE)
that describes how to set the test running to be Intellij instead of Gradle.

#### Running gradlew test

```bash
./gradlew test

* What went wrong:
Execution failed for task ':test'.
```

Check
this [option](https://stackoverflow.com/questions/69706309/org-gradle-api-internal-tasks-testing-testsuiteexecutionexception-could-not-com)
of
swap platform with `useJUnit()  // JUnit 4` 