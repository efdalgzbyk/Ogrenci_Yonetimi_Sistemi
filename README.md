🎓 Student Management System (Java OOP)

Bu proje, Java Nesne Yönelimli Programlama (OOP) konularını pekiştirmek amacıyla geliştirilmiş basit bir Öğrenci Yönetim Sistemi örneğidir.

📌 Proje Amacı

Bu proje ile aşağıdaki Java konuları uygulanmıştır:

Class & Object

Encapsulation (private fields, getter & setter)

Inheritance (extends)

Abstraction (abstract class)

Interface (implements)

Polymorphism (method overriding)

Collections (ArrayList)

🧱 Proje Yapısı
📁 src
 ┣ 📄 Main.java
 ┣ 📄 Person.java
 ┣ 📄 Student.java
 ┗ 📄 NotHesaplama.java

🧩 Sınıflar ve Görevleri
🔹 Person (Abstract Class)

Ortak özellikleri tutar (id, name)

Constructor, getter & setter içerir

bilgiYazdir() metodu ile temel bilgileri yazdırır

🔹 Student (Subclass)

Person sınıfından türetilmiştir

Ek alanlar: department, grade

bilgiYazdir() metodu override edilmiştir

NotHesaplama interface’ini uygular

🔹 NotHesaplama (Interface)

Öğrencinin geçme / kalma durumunu hesaplayan metodu tanımlar

🔹 Main

ArrayList<Student> kullanır

Öğrenci nesneleri oluşturur

Tüm öğrencilerin bilgilerini ekrana yazdırır

⚙️ Çalışma Mantığı

Öğrenciler ArrayList içerisine eklenir

Her öğrenci için:

Kimlik bilgileri

Bölüm

Not

Geçti / Kaldı durumu

Bilgiler polymorphism sayesinde tek bir method çağrısıyla yazdırılır

🖥️ Örnek Çıktı
ID: 1
İsim: Ali
Bölüm: Bilgisayar
Not: 75
Durum: Geçti
--------------------
ID: 2
İsim: Ayşe
Bölüm: Yazılım
Not: 45
Durum: Kaldı

▶️ Nasıl Çalıştırılır?

Projeyi klonlayın:

git clone https://github.com/kullanici-adi/student-management-system.git


Java ile derleyip çalıştırın:

javac Main.java
java Main

🚀 Geliştirme Fikirleri

Scanner ile kullanıcıdan öğrenci alma

En yüksek notu alan öğrenciyi bulma

Dosyaya öğrenci kaydetme

GUI (JavaFX / Swing) ekleme

🧠 Öğrenilenler

Bu proje, Java’da nesne yönelimli düşünme, bellek yönetimi (heap & reference) ve interface kullanımı konularını anlamaya yardımcı olur.

✍️ Yazar

Efdal Gözübüyük
Software Engineering Student
Java | OOP | Full-Stack Adayı
