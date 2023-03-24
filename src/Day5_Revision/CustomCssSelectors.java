package Day5_Revision;

public class CustomCssSelectors {

    // ==============================ID=================================
    // https://naveenautomationlabs.com/opencart/index.php?route=account/register
    //1. Id in CSS ==> #id
    //   #input-firstname
    //2. tagName#id
    //   input#input-firstname

    //================================Class==================================
    // 1.Class in CSS => .classValue
    //  .form-control
    // 2. tagName.classValue

    //=============================Multiple Classes===================================
    // https://app.hubspot.com/login
    // 1. .c1.c2.c3.....cn
    // .form-control.private-form__control.login-email
    //2.tagName.c1.c2.c3....cn
    // input.form-control.private-form__control.login-email

    // Selected class values
    // .c1.c2.c3.....cn  ==> .c1.c3.c4
    //.form-control.private-form__control
    //input.login-email

    // Mange order as per your choice
    //.c2.c4.c1
    //  .login-email.form-control.private-form__control

    //===============================================================================
    // Can we combine id and class together
    //  #id.class
    // #username.form-control.private-form__control.login-email
    // #username.login-email
    // tagName#id.class
    // input#username.login-email

    //.class#id
    //.login-email#username
    //tagName.class#id
    // input.login-email#username

    // Identify webElement using css without class or id [ by using other available attributes]
    // tagName[attribute='value']
    // input[type='email']

    // Multiple Attributes
    //tagName[attribute1='value1'][attribute2='value2'][attribute3='value3']......[attributeN='valueN']
    // input[name='firstname'][type='text'][id='input-firstname']

    // Can we use id or class with other attributes
    // #id[attribute='value']
    // #input-firstname[name='firstname']

    // .class[attribute='value']
    //.form-control[name='firstname']

    // tagName#id[attribute='value']
    //input#input-firstname[name='firstname']

    // tagName.class[attribute='value']
    //input.form-control[name='firstname']

    // Can we use text in CSS to create CSS locator
    // 1. Text is not supported in CSS

    // Contains in CSS
    //tagName[attribute*='attributeValue']
    // input[name*='firstname']
    // input[name*='name']
    // input[name*='first']

    // starts with in Css
    //tagName[attribute^='attributeValue']
    // input[name^='f']

    // ends with
    //tagName[attribute$='attributeValue']
    // input[name$='me']

    // parent child
    // parentTagName childTagName
    // div[class='private-form__input-wrapper'] input[type='email']
    // select#Form_getForm_Country option


}
