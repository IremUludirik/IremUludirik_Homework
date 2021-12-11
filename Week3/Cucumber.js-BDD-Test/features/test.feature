Feature: biletino.com uzerinden gerceklestirilen bilet senaryolari

    @positive
        Scenario Outline: Arama yapma
            Given Anasayfa icerisindeki, search box uzerine gelinir.
            When Search Box icerisine <type> yazilir.
            Then Belirtilen bilet turune sahip olan etkinlikler siralanir.
            Examples:
                | type     |
                | konser   |
                | seminer  |
                | workshop |             



    @Negative
        Scenario Outline: Bilet alamama
            Given Anasayfa acilir. 
            Given Rastgele bir etkinlige basilir.
            When Biletleri Gor butonuna basilir.
            When Bilet adedi yazan butonuna basilir. 
            When <numOfTickets> adet bilet secilir.
            When Secili biletleri al yazan butonuna basilir.
            Then E-mail adresi istenir, bilet alinamaz.
            Examples:
                | numOfTickets | 
                | 2            |
                | 3            |
                | 5            |



    @Positive
        Scenario Outline: Bilet alma
            Given Anasayfaya gidilir. 
            Given Bir etkinlige basilir.
            When Bileti Gor butonuna basilir.
            When Bilet adedi butonuna basilir.
            When Bilet sayisi <numOfTickets> olan secilir.
            When Secili biletleri al butonuna basilir.
            When E-mail adresi istenir, onceki email silinir.
            When <email> girilir.
            When Uye olmadan devam et butonuna basilir.
            Then Bilet alimi icin girilecek bilgiler sayfası acilir.
            Examples:
                | numOfTickets  | email                 |
                | 1             | irem6rock@hotmail.com | 
                | 4             | abcd@gmail.com        | 




