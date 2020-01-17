This plugin exercises the Spring capabilities of Spinnaker plugins. There are no PF4J extension points or dependencies. Instead everything is Spring components.

It tests the following cases and all of it works without having to use Kork plugin's "unsafe" mode:
* new plugin beans are wired together
* app beans are autowired into plugin beans
* plugin beans are autowired into the app beans and replace app beans if primary (this allows modifying existing spinnaker behavior)
* properties are recognized
* controllers add new endpoints
* new dependencies that are not in Spinnaker can be used in your plugin beans

Some things that don't work:
* the Configuration annotation won't be recognized in a plugin bean so you can't create beans that way
* class path scanning your plugin
* the Conditional annotation won't be recognized in a plugin bean
* Comnponent and Primary annotations aren't recognized, but that functionality still exists

Your plugin needs to extend PrivilegedSpringPlugin and implement registerBeanDefinitions(BeanDefinitionRegistry) to explicitly create and register BeanDefinitions. There are helper methods to make this easier and they default to singleton scope with constructor autowiring.  See SpringExamplePlugin for an example.

We will probably need was way for registerBeanDefinitions(BeanDefinitionRegistry) to conditionally load beans based on the service that it is used in. I didn't see a good way to do that. It would be possible to cast BeanDefinitionRegistry to DefaultListableBeanFactory and look at the serializationId, but that relies on some implementation details.

A new release for Kork and updating that dependency is required. This had been tested against a branch of Kork locally withg the required changes.

Build with `./gradlew build` and copy that zip under `/build` into the plugins location of your service (by default the `/plugins` directory under your service root.

The following should be added to your service yml config.
```
spinnaker:
  extensibility:
    plugins:
      Armory.SpringExamplePlugin:
        enabled: true

newproperties:
  test: 'test1'
```

