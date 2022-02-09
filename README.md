# SpringBoot-Docker-Postgresql
##CASE
Görev 1 (Zorunludur) Aşağıda belirtilen akışı yerine getirecek API’yi herhangi bir yazılım dili 
ile kodlayınız.
● API’nin giriş ekranında adınız ve soyadınız yazmalı.
● Geliştirdiğiniz API “/temperature” olarak bir endpoint’e sahip olmalı.
● İlgili endpoint’e; GET metodu ile ilgili şehrin ismini city parametresi ile gönderdiğinizde 
JSON formatında ilgili şehrin hava sıcaklığı ekrana yazdırılmalıdır. (POST isteği kabul 
etmemeli)
Aşağıdaki adreslerde ilgili örneği görebilirsiniz. Siz de kendi uygulamanızı aynı şekilde bizimle 
paylaşınız.
https://caseapi.bestcloudfor.me
https://caseapi.bestcloudfor.me/temperature?city=istanbul
Görev 2 (Zorunludur) Geliştirmiş olduğunuz uygulamanın bir container içinde 
çalışabilmesini sağlayınız. Sektörde biz bu işleme containerize etmek diyoruz.
• Dockerfile ile yapılması + puandır.
• README.md dosyasında containerize edilmiş uygulamanın nasıl build alınacağı ve 
nasıl çalıştırılacağı belirtilmelidir.

# Case Çözümü
`docker-compose up`  dediğimizde ilk başta postgresqldb containerini yaratıp bestcloudforme databasei olmadığı için case containerini yaratamaz
## Bunun için 
`docker exec -it postgresqldb bash`

`psql -U postgres`

`CREATE database bestcloudforme;`

`\l ile olan databaseleri listeleyebiliriz`

sonrasında çalışmamış container olan case ı ayağa kaldırabiliriz.
`\c bestcloudforme`

`\dt;`

`insert into cities(id,name,temperature) values(1,'istanbul',37.9);`

`select * from cities;`

**http://localhost:8080** 

**http://localhost:8080/temperature?city=istanbul**
