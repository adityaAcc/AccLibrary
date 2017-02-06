# AccLibrary
Simple Libraries for Acc

# Form Validations

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
if(FieldValidation.validateFields(context, _email, _phone, _password, _confPass)){
    //do something on success
 }
```
Login Form Registration
```groovy
if(FieldValidation.validateLFields(context, _email, _password)){
    //do something on success
}
```
