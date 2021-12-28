# Cicek Sepeti Bootcamp API Test :palm_tree::hibiscus:


:pushpin: An integration test was written to check the responses returned based on the cityName parameter for the API in the submitted POSTMAN collection.
&nbsp;
:pushpin: Import link: https://www.getpostman.com/collections/c1fff77a2f21ae1702ea
&nbsp;

# :white_check_mark::lollipop: All Results Before Details
<a href="https://resimlink.com/YXah" title="ResimLink - Resim Yükle"><img src="https://r.resimlink.com/YXah.jpg" title="ResimLink - Resim Yükle" alt="ResimLink - Resim Yükle"></a>
<a href="https://resimlink.com/lwPa76" title="ResimLink - Resim Yükle"><img src="https://r.resimlink.com/lwPa76.jpg" title="ResimLink - Resim Yükle" alt="ResimLink - Resim Yükle"></a>
&nbsp;

**Details:**
#:star2::earth_americas: environment
<a href="https://resimlink.com/hTNpDq" title="ResimLink - Resim Yükle"><img src="https://r.resimlink.com/hTNpDq.jpg" title="ResimLink - Resim Yükle" alt="ResimLink - Resim Yükle"></a>

# :star2:**cityName :arrow_right: ankara :arrow_right: Ankara ili için yapılan yorumlar listesi** :dart:
Tests of;
- General:
    - cityName check for Json Data
    - length of reviewDtos
    - type of reviewDtos
    - element size of the reviewDtos's objects
    - Status code is 200
    - Status code name has string
    &nbsp;

 **&nbsp;   &nbsp;  &nbsp;  &nbsp; This part: for the whole list**
- cityName:
    - cityName is only ANKARA
    - type of cityName
    - first letter of the cityName is upper case

- comment:
    - total comment value equal to reviewDtos objects number
    - type of comment
    - first letter of the comment should be an upper case

- name:
    - type of name
    - at least two words for name
    - name should not have special character

- rating:
    - type of rating
    - rating value should be zero and bigger than zero

- createOn:
    - type of createOn
    - last digit of the createOn should be a letter
    - first digit of the createOn shoulde be a number
    - length of the createOn

- regionName:
    - type of regionName
    &nbsp;

**&nbsp;   &nbsp;  &nbsp;  &nbsp;This part: for the list whose cityName is only ANKARA**
- General:
    - type of the objects ,for only ANKARA,
    - length of the objects ,for only ANKARA,

- cityName:
    - type of cityName ,for only ANKARA,
    - first letter of the cityName is upper case ,for only ANKARA,

- comment:
    - total comment value equal to reviewDtos objects number ,for only ANKARA,
    - type of comment ,for only ANKARA,
    - first letter of the comment should be an upper case ,for only ANKARA,

- name:
    - type of name ,for only ANKARA,
    - at least two words for name ,for only ANKARA,
    - name should not have special character ,for only ANKARA,

- rating:
    - type of rating ,for only ANKARA,
    - rating value should be zero and bigger than zero ,for only ANKARA,

- createOn:
    - type of createOn ,for only ANKARA,
    - last digit of the createOn should be a letter ,for only ANKARA,
    - first digit of the createOn shoulde be a number ,for only ANKARA,
    - length of the createOn ,for only ANKARA,

- regionName:
    - type of regionName ,for only ANKARA,

<a href="https://resimlink.com/2knc" title="ResimLink - Resim Yükle"><img src="https://r.resimlink.com/2knc.jpg" title="ResimLink - Resim Yükle" alt="ResimLink - Resim Yükle"></a>
<a href="https://resimlink.com/Qph43N" title="ResimLink - Resim Yükle"><img src="https://r.resimlink.com/Qph43N.jpg" title="ResimLink - Resim Yükle" alt="ResimLink - Resim Yükle"></a>
&nbsp;


# :star2: **cityName :arrow_right: istanbul       :arrow_right: İstanbul ili için yapılan yorumlar listesi** :dart:
Tests of;
- General:
    - cityName check for Json Data
    - length of reviewDtos
    - type of reviewDtos
    - element size of the reviewDtos's objects
    - Status code is 200
    - Status code name has string

- cityName:
    - size of cityName
    - reviewDtos size equal to cityNameCheck size
    - type of cityName
    - first letter of the cityName is upper case

- comment:
    - comment size equal to reviewDtos size
    - type of comment
    - first letter shoulde be upper case

- name:
    - type of name
    - at least two words for name
    - name should not have special character

- rating:
    - type of rating
    - rating value

- createOn:
    - type of createOn
    - last digit of the createOn should be a letter
    - first digit of the createOn shoulde be a number
    - length od the createOn

- regionName:
    - type of regionName

 <a href="https://resimlink.com/iqZv1Q5c" title="ResimLink - Resim Yükle"><img src="https://r.resimlink.com/iqZv1Q5c.jpg" title="ResimLink - Resim Yükle" alt="ResimLink - Resim Yükle"></a>   
 <a href="https://resimlink.com/uIFeYhy" title="ResimLink - Resim Yükle"><img src="https://r.resimlink.com/uIFeYhy.jpg" title="ResimLink - Resim Yükle" alt="ResimLink - Resim Yükle"></a>
&nbsp;

# :star2: **cityName :arrow_right: van :arrow_right: status is 404** :dart:
Tests of;
- General:
    - cityName check for Json Data
    - length of body
    - type of message
    - syllable of message
    - digit of message
    - first letter of message is upper case
    - message should not have specialChar
    - Status code is 404
    - message
    - Status code name has string

<a href="https://resimlink.com/vufRz3K" title="ResimLink - Resim Yükle"><img src="https://r.resimlink.com/vufRz3K.jpg" title="ResimLink - Resim Yükle" alt="ResimLink - Resim Yükle"></a>
<a href="https://resimlink.com/jTO2ZKX" title="ResimLink - Resim Yükle"><img src="https://r.resimlink.com/jTO2ZKX.jpg" title="ResimLink - Resim Yükle" alt="ResimLink - Resim Yükle"></a>

&nbsp;


# :star2: **cityName :arrow_right: null :arrow_right: status is 400** :dart:
Tests of;
- General:
    - cityName check for Json Data
    - type of body
    - type of cityName
    - length of body
    - cityName should not have specialChar
    - Status code is 404
    - cityName value
    - Status code name has string

<a href="https://resimlink.com/fkvc4FQI" title="ResimLink - Resim Yükle"><img src="https://r.resimlink.com/fkvc4FQI.jpg" title="ResimLink - Resim Yükle" alt="ResimLink - Resim Yükle"></a>
<a href="https://resimlink.com/OUYTClI" title="ResimLink - Resim Yükle"><img src="https://r.resimlink.com/OUYTClI.jpg" title="ResimLink - Resim Yükle" alt="ResimLink - Resim Yükle"></a>
&nbsp;