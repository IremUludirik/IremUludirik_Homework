# Javada Page Object Model ile Android Test Otomasyonu
:tada: Detaylar için Medium üzerinden yazdığım yazıya bakabilirsiniz:
&nbsp;

https://medium.com/@iremuludirik/javada-page-object-model-ile-android-test-otomasyonu-ad0fd13b2453

**EN**

- Appium Server, Appium Inspector, Android Studio, emulator were used.
- Worked with APKs.
- Dependencies installations have taken place.
- Started test recording via Appium and exported as Java.
- The codes were compiled in accordance with the page object model.

    **Sign Up Page**
    &nbsp;
    
  - Scenario I: Not being a member
      - Login to the application.
       - Press the "Join for free" button.
       - E-mail is entered.
       - Enter username containing invalid characters (!'^+%&/()=?* etc.).
       - Password is entered.
       - When the password is entered, the warning message is checked.
    &nbsp;

    
  - Scenario II: Successfully signing up
      - Login to the application.
       - Press the "Join for free" button.
       - E-mail is entered.
       - Enter a suitable, valid username.
       - Password is entered.
       - The date of birth is printed on the calendar.
       - Day, month, year are selected from the calendar.
       - Date of birth is set.
       - Press the start button.
       - Become a member and check the Welcome title.
    &nbsp;
    &nbsp;

  
   **Login Page**
    &nbsp;
    
  - Scenario I: Trying to log in with the wrong password
      - Login to the application.
       - Press the "Login" button.
       - A previously registered Username is entered.
       - Wrong password is entered.
       - Login button is pressed.
       - The warning message that the wrong password has been entered is checked.
    &nbsp;

    
  - Scenario II: Forgetting the password
      - Login to the application.
       - Press the "Login" button.
       - "Forgot your password?" is clicked on.
       - To reset the password, a previously registered username is entered.
       - Press the "Send" button.
       - The notification box is checked, indicating that the password reset link has been sent to the registered e-mail.
  
    &nbsp;
    &nbsp;


**TR**

- Appium Server, Appium Inspector, Android Studio, emulatör kullanıldı.
- APK’ler ile çalışıldı.
- Dependencies kurulumları gerçekleşti.
- Appium üzerinden test kaydı başlatıp Java olarak export edildi.
- Kodlar page object modele uygun şekilde derlendi.

    **Sign Up Page**
    &nbsp;
    
  - Senaryo I: Üye olamamak
      - Uygulamaya giriş yapılır.
      - "Join for free" butonuna basılır.
      - E-mail girilir.
      - Geçersiz karakter içeren (!'^+%&/()=?* vb.) username girilir.
      - Şifre girilir.
      - Şifre girilince, uyarı mesajı kontrol edilir.
    &nbsp;

    
  - Senaryo II: Başarılı bir şekilde üye olmak
      - Uygulamaya giriş yapılır.
      - "Join for free" butonuna basılır.
      - E-mail girilir.
      - Uygun, geçerli bir username girilir.
      - Şifre girilir.
      - Doğum tarihi için takvime basılır.
      - Takvimden gün, ay, yıl seçilir.
      - Doğum tarihi set edilir.
      - Start butonuna basılır.
      - Üye olunur ve Welcome başlığı kontrol edilir.
    &nbsp;
    &nbsp;

  
   **Login Page**
    &nbsp;
    
  - Senaryo I: Yanlış şifre ile giriş yapmaya çalışmak
      - Uygulamaya giriş yapılır.
      - "Login" butonuna basılır.
      - Daha önce kayıt olunmuş bir Username girilir.
      - Hatalı şifre girilir.
      - Login butonuna basılır.
      - Hatalı şifre girildiğine dair uyarı yazısı kontrol edilir.
    &nbsp;

    
  - Senaryo II: Şifreyi unutmak
      - Uygulamaya giriş yapılır.
      - "Login" butonuna basılır.
      - "Forgot your password?" yazısına tıklanır.
      - Şifreyi resetlemek için daha önce kayıt olmuş bir username girilir.
      - "Send" butonuna basılır.
      - Kayıtlı olan e-maile, şifre resetleme linkinin gönderildiğine dair bilgilendirme kutusu kontrol edilir.
  
    &nbsp;
    &nbsp;

<div align ="center">
  
 # :open_file_folder: Klasörleme :open_file_folder:
  
&nbsp;
<a href="https://resimlink.com/dWjNGIt1" title="ResimLink - Resim Yükle"><img src="https://r.resimlink.com/dWjNGIt1.jpg" title="ResimLink - Resim Yükle" alt="ResimLink - Resim Yükle"></a>


&nbsp;


# :tada::tada: Başarı :clap::clap:
  &nbsp;
  - Sin Up:
  &nbsp;
  
  <a href="https://resimlink.com/JjhD" title="ResimLink - Resim Yükle"><img src="https://r.resimlink.com/JjhD.jpg" title="ResimLink - Resim Yükle" alt="ResimLink - Resim Yükle"></a>
    &nbsp;
  
  - Login:
  &nbsp;
  
<a href="https://resimlink.com/SKoEL" title="ResimLink - Resim Yükle"><img src="https://r.resimlink.com/SKoEL.jpg" title="ResimLink - Resim Yükle" alt="ResimLink - Resim Yükle"></a>

