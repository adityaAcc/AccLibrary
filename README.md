# AccLibrary
Simple Libraries for Acc

# Form Validations

Add this to your root build.gradle
```groovy
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
gradle:

```groovy
compile 'com.github.adityaAcc:AccLibrary:e89f1fecb1'
```
Usage:

Set length of password
```groovy
FieldValidation.setPasswordLength(10);
```
Registration Form Validation
```groovy
if(FieldValidation.validateRFields(context, _email, _phone, _password, _confPass)){
    //do something on success
 }
```
Login Form Validation
```groovy
if(FieldValidation.validateLFields(context, _email, _password)){
    //do something on success
}
```
