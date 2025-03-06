# Dağıtık Sistemler Projesi

Bu proje, Docker teknolojisi kullanılarak oluşturulmuş dağıtık bir sistem mimarisidir. Projede, Nginx yük dengeleyici, iki adet replikasyonlu Spring Boot uygulama sunucusu, PostgreSQL veritabanı sunucusu ve Redis cache sunucusu yer almaktadır.

## Mimari Bileşenler

- **Nginx**: Yük dengeleyici (Port 80)
- **Spring Boot App1**: Birinci uygulama sunucusu (Port 8080)
- **Spring Boot App2**: İkinci uygulama sunucusu (Port 8081)
- **PostgreSQL**: Veritabanı sunucusu (Port 5432)
- **Redis**: Cache sunucusu (Port 6379)

## Ön Koşullar

- Docker Engine
- Docker Compose
- Java 17 JDK (Geliştirme için)
- Maven (Geliştirme için)

## Kurulum ve Çalıştırma

1. Projeyi klonlayın:
```bash
git clone <repository_url>
cd <repository_directory>
```

2. Spring Boot uygulamalarını derleyin:
```bash
cd app1
mvn clean package
cd ../app2
mvn clean package
cd ..
```

3. Docker container'larını başlatın:
```bash
docker-compose up --build -d
```

4. Uygulamaya erişim:
```
http://localhost
```

## Container'ları Durdurma

```bash
docker-compose down
```

## Sorun Giderme

### Logları Kontrol Etme
```bash
# Nginx logları
docker logs distributed-system-nginx-1

# App1 logları
docker logs distributed-system-app1-1

# App2 logları
docker logs distributed-system-app2-1

# PostgreSQL logları
docker logs distributed-system-postgres-1

# Redis logları
docker logs distributed-system-redis-1
```

### Port Çakışmaları
Eğer portlarda çakışma yaşanıyorsa, `docker-compose.yml` dosyasında port eşleştirmelerini değiştirebilirsiniz.

## Katkıda Bulunma
1. Fork'layın
2. Feature branch oluşturun (`git checkout -b feature/amazing-feature`)
3. Değişikliklerinizi commit edin (`git commit -m 'feat: Add amazing feature'`)
4. Branch'inizi push edin (`git push origin feature/amazing-feature`)
5. Pull Request oluşturun 