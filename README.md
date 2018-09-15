# CurrentActivity
Single class library to get current activity for classes that should hold no reference to any context.

## Usage:

#### Initialize in your Application class:
```kotlin
class App : Application() {
    override fun onCreate() {
        super.onCreate()
        CurrentActivity.init(this)
    }
}
```

#### Use anywhere:
```kotlin
val currentActivity = CurrentActivity.get()
```

Download
--------

```groovy
dependencies {
    implementation 'io.github.pau1adam:currentactivity:1.0.0'
}
```

License
-------
    Copyright 2018 Pavlos Adam

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
