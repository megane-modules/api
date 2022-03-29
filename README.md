`megane-modules/api` 
====================

### On your `build.gradle`:
```gradle
repositories {
    maven { url "https://maven.bai.lol" }
}

dependencies {
    modImplementation "lol.bai.megane:megane-api:${meganeApiVersion}"
    modRuntimeOnly "lol.bai.megane:megane-runtime:${meganeRuntimeVersion}"

    // you can also depend to other modules
    modRuntimeOnly "lol.bai.megane:megane-vanilla:${meganeVanillaVersion}"
}
```
Check megane module versions in one of the release in the bundler repository [here](https://github.com/badasintended/megane/releases).

### Create some provider, for example an `EnergyProvider`:
```java
public class MyEnergyProvider extends EnergyProvider<MyBlockEntity> {
    @Override
    public long getStored() {
        return getObject().getStoredEnergy();
    }
    
    @Override
    public long getMax() {
        return getObject().getMaxEnergy();
    }
}
```

### Implement `lol.bai.megane.api.MeganeModule`, register your provider there:
```java
public class MyMeganeModule implements MeganeModule {
    @Override
    public void registerCommon(CommonRegistrar registrar) {
        registrar.addEnergy(MyBlockEntity.class, new MyEnergyProvider());
    }
}
```

### Add your class to `fabric.mod.json`:
```json5
"custom": {
  "megane:modules": [
    "path.to.MyMeganeModule"
  ]
}
```
