# 🏨 Turizm Acente Yönetim Sistemi

## 📋 Proje Hakkında
Bu proje, turizm acentelerinin operasyonlarını yönetmek için geliştirilmiş kapsamlı bir Java Swing uygulamasıdır. N-katmanlı mimari kullanılarak geliştirilmiştir.

## 🎥 Demo
[Canlı Demo İzle](https://www.loom.com/share/8df1e47722474365b86a4a4598d7fae0?sid=6ebd0d7f-9ffd-478d-b0b0-25117a34cf04)

## 🏗️ Sistem Mimarisi
Bu proje beş ana paketten oluşmaktadır: DAO (Data Access Object), Business, Entity, Core ve View.

Turizm acentesi projesi, otel yönetimi, oda rezervasyonları, müşteri bilgileri ve kullanıcı yönetimi sağlayan bir uygulamadır. Otel ekleme, oda yönetme, rezervasyon yapma ve müşteri bilgilerini güncellemeyi içerir. Kullanıcılar yönetici ve çalışan gibi farklı rollerde oluşturularak iş süreçlerinin daha etkin yönetilmesi sağlanır. Sonuç olarak turizm acentesi projesi seyahat ve konaklama süreçlerini kolaylaştırarak hizmet vermektedir.

# Proje özellikleri
## Otel Yönetimi
Yeni oteller ekleyebilirsiniz.
Mevcut otelleri görüntüleyebilir ve düzenleyebilirsiniz.
Otel bilgilerini güncelleyebilir ve silebilirsiniz.


## Oda Yönetimi
Bir otele yeni odalar ekleyebilirsiniz.
Mevcut odaları görüntüleyebilir ve düzenleyebilirsiniz.
Oda bilgilerini güncelleyebilir ve silebilirsiniz.

## Rezervasyon Yönetimi
Rezervasyon yapın ve görüntüleyin.
Rezervasyon bilgilerini güncelleyin ve silin.

## Kullanıcı Yönetimi
Yeni kullanıcılar ekleyin ve mevcut kullanıcıları görüntüleyin.
Kullanıcı bilgilerini güncelleme ve silme.
Kullanıcılara "yönetici" ve "çalışan" rolleri atayın.

## Örnek Kullanım Durumları
Yeni Bir Otel Ekleme: Yeni bir otel eklemek için ana ekrandaki "Otel Ekle" butonuna tıklayın. Eklenen otelleri görmek için "Otel Listesi" sekmesini ziyaret edin.
Yeni Oda Ekleme: "Oda Ekle" sekmesinden mevcut bir otele yeni bir oda ekleyebilirsiniz.
Rezervasyon Yapma: Rezervasyon yapmak için "Rezervasyon Yap" sekmesinden uygun bir otel seçin.
Kullanıcı Oluşturma: "Kullanıcılar" sekmesinden yeni bir kullanıcı oluşturun ve kullanıcıya "yönetici" veya "çalışan" rolü atayın.
Rezervasyon Güncelleme/Silme: "Rezervasyonlar" sekmesinde mevcut rezervasyonları görüntüleyebilir, güncelleyebilir veya silebilirsiniz.

## Proje Yapısı
Proje 5 ana paketten oluşmaktadır:

dao Katmanı: Veritabanı işlemlerini yöneten Veri Erişim Nesneleri.
business Katmanı: İş mantığı işlemlerini içeren sınıflar.
entity Katmanı: Veritabanı tablolarını temsil eden varlık sınıfları.
core Katman: Temel yardımcı sınıflar ve araçlar.
view Katmanı: Swing Kullanıcı Arayüzü (UI) bileşenlerini içeren sınıflar.

## Teknolojiler
Java JDK 8 veya üzeri sürüm
PostgreSQL veritabanı

