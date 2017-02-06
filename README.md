# AccLibrary
Simple Libraries for Acc

# Registration Form Validation

gradle:

```groovy
compile 'com.github.adityaAcc:AccLibrary:3e12e79875'
```
Usage:

Set length of password
```groovy
FieldValidation.setPasswordLength(10);
```
Validation
```groovy
if(FieldValidation.validateFields(context, _email, _phone, _password, _confPass)){
    //do something on success
 }
```

