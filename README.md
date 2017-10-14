# karaf4-osgi-exam
karaf4 exam

## build & deploy

 * require
  
  install karaf 4.1.2

 * build

```
mvn install
```


 * Deploy Declarative Service

```
feature:repo-add mvn:azkaoru-karaf4-osgi-exam/karaf4-osgi-exam-samples-ds/1.0.0/xml/features
feature:install osgi-exam-ds
``` 

## test

* prepare 

this is required 
```
mvn clean install -Dmaven.test.skip=true
```

* test

```
mvn install
```

