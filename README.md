# AccLibrary
Simple Libraries for Acc

# Registration Form Validation

gradle:

```groovy
compile 'com.github.adityaAcc:AccLibrary:3e12e79875'
```
Usage:

```groovy
if(FieldValidation.validateFields(Register.this, _email, _phone, _password, _confPass)){
    Toast.makeText(Register.this,"Successfully Registered.",Toast.LENGTH_SHORT).show();
 }
```

