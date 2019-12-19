This plugin exercises the Spring capabilities of Spinnaker plugins. There are no PF4J extension points. Instead everything is Spring components.
It tests the following cases:
* plugin components are wired together
* app components are wired into plugin
* plugin components are wired into app
* configuration and properties are recognized

The following should be added to your service yml config.
```
spinnaker:
  extensibility:
    plugins:
      Armory.SpringExamplePlugin:
        enabled: true

newproperties:
  enabled: true
  test: 'test1'
```

