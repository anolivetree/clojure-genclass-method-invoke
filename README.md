
# how to reproduce

```
make // you don't need this if you use precompiled jars in lib/
vim project.clj // choose ver2.jar or ver1.jar in  :resource-paths ["lib/ver2.jar"]
lein uberjar
java -cp lib/ver1.jar:./target/uberjar/proj-0.1.0-SNAPSHOT-standalone.jar proj.core
```
- 
