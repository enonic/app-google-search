# Google AI search widget for Enonic XP

Adds embed code for Google AI search widget to your website.

NOTE: It only adds it in `live` mode.

## App configuration

For the application to work you need to add `com.enonic.app.googlesearch.cfg` file to the `config` directory inside the Enonic XP home.

There are 2 mandatory configuration values:

| Name                        | Description                           |
|-----------------------------|---------------------------------------|
| `google.configId`           | The Google app integration id.        |
| `google.serviceAccountJson` | Google service account json file path |

### Example

```properties
google.serviceAccountJson=${xp.home}/config/service-account-data.json
google.configID=xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx
```

NOTE: you can use `${xp.home}` placeholder to refer the Enonic XP home directory in the file path.

## Site configuration

Additionally, you can configure widget trigger icon, animation and tooltip text in the site configuration.
