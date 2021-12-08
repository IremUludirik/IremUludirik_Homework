# CicekSepeti-TestAutomation (TR/EN)
:tada: 4 cases with the 2 classes

Bütün Caselerden önce:
  - Site açılır.
  - Ekran max. boyuta getirilir.
  - Pop-up'lar kapatılır.

# Class 1: Login 
- Case 1: False Login
  - Kullanıcı, "Üyelik" butonu üstüne gelir ve "Üye Girişi" yazısına tıklar.
  - e-mail adresini girilir.
  - Hatalı bir sifre girilir.
  - "Giriş" butonuna basılır.
  - Ekrana uyarı yazısı gelir ve "Tamam" a basılarak kapatılır.
  - Kullanıcı girişini yapamaz.

- Case 2: True Login
  - Kullanıcı, "Üyelik" butonu üstüne gelir ve "Üye Girişi" yazısına tıklar.
  - e-mail adresini girilir.
  - Şifre girilir.
  - "Giriş" butonuna basılır.
  - Kullanıcı giriş yapabilir.

# Class 2: Basket
- Case 3: With Calendar
  - Kullanıcı, "Çiçek" kategorisi üstüne gelir ve "Bonsai" seçeneğine tıklar.
  - Ürün seçilir.
  - Açılan ürün ekranında, adres bilgileri yazılır ardından seçilir.
  - Tarih seçmek için, "Takvim" butonuna basılarak gün seçilir.
  - Teslim saati seçilir.
  - Butona basılarak sipariş onaylanır.
  - Site bizi "Login" ekranına atar. Buradan "Geri" butonuna tıklanarak çıkılır.
  - Sepetimizde eklenilen ürün gözükür.
  
- Case 4: Without Calendar
  - Kullanıcı, "Market" kategorisi üstüne gelir ve "Gıda" seçeneğine tıklar.
  - "Kuruyemiş" alt kategorisine tıklanır.
  - Ürün seçilir.
  - Butona basılarak onaylanır.
  - Sepetimizde eklenilen ürün gözükür.
______________________________________________________________________________________________________________________________________________________

## EN:

Before All Cases:
  - The site opens.
  - Screen max. is sized.
  - Pop-ups are turned off.

# Class 1: Login
- Case 1: False Login
  - The user hovers over the "Membership" button and clicks on the "Member Login" text.
  - Enter your e-mail address.
  - An incorrect password is entered.
  - Press the "Login" button.
  - A warning message appears on the screen and is closed by pressing "OK".
  - User cannot login.

- Case 2: True Login
  - The user hovers over the "Membership" button and clicks on the "Member Login" text.
  - Enter your e-mail address.
  - Password is entered.
  - Press the "Login" button.
  - User can login.

# Class 2: Basket
- Case 3: With Calendar
  - The user hovers over the "Flower" category and clicks on the "Bonsai" option.
  - The product is selected.
  - On the product screen that opens, address information is written and then selected.
  - To select the date, the day is selected by pressing the "Calendar" button.
  - Delivery time is selected.
  - The order is confirmed by pressing the button.
  - The site throws us to the "Login" screen. Exit here by clicking the "Back" button.
  - The product added to our cart appears.
  
- Case 4: Without Calendar
  - The user hovers over the "Market" category and clicks on the "Food" option.
  - Click on the "Nuts" sub-category.
  - The product is selected.
  - Confirmed by pressing the button.
  - The product added to our cart appears.
