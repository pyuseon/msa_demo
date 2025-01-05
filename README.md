# MSA 초심자를 위한 데모 프로젝트

## 개요
이 프로젝트는 마이크로서비스 아키텍처(MSA)를 처음 접하는 개발자를 위한 데모 프로젝트입니다. 기본적인 MSA 구성과 서비스 간 통신을 학습할 수 있도록 설계했습니다. 😄

---

## 프로젝트 구조

```
├── discovery-server
├── apigateway-service
├── config-service (추후 업데이트 예정)
├── first-service
├── second-service
├── base-service
├── order-service
├── catalog-service
├── user-service
```

---

## 서비스 설명

### 1. Discovery Server
- **역할:** 서비스 레지스트리 및 디스커버리 관리.
- **기술:** Spring Cloud Eureka Server.
- **기능:**
  - 모든 마이크로서비스의 등록 및 상태 관리.
  - 동적 서비스 탐색을 지원하여 로드 밸런싱과 확장성을 제공.

### 2. API Gateway Service
- **역할:** 클라이언트 요청 라우팅 및 필터링.
- **기술:** Spring Cloud Gateway.
- **기능:**
  - 라우팅: 특정 경로에 따라 요청을 적절한 서비스로 전달.
  - 필터: 보안, 인증 및 로깅과 같은 기능 제공.
  - 부하 분산 및 트래픽 관리 지원.

### 3. Config Service (추후 업데이트 예정)
- **역할:** 중앙 집중형 설정 관리.
- **기술:** Spring Cloud Config Server.
- **기능:**
  - 각 서비스의 설정 정보를 중앙에서 관리 및 배포.
  - 설정 변경 시 실시간 업데이트 지원.

### 4. First Service, Second Service, Base Service
- **역할:** 초반 테스트 및 서비스 간 통신 예제.
- **기술:** Spring Boot 기반 마이크로서비스.
- **기능:**
  - 서비스 간 호출 및 데이터 교환을 테스트.
  - 초기 MSA 설정과 API 연동 테스트.

### 5. Order Service
- **역할:** 주문 관리 시스템 구현.
- **기능:**
  - 주문 생성, 조회, 취소 기능.
  - **Kafka**를 활용한 **Catalog Service**와의 비동기 메시지 통신.
  - 유저 서비스와 **Feign Client**를 활용한 통신.

### 6. Catalog Service
- **역할:** 제품 정보 관리.
- **기능:**
  - 상품 등록, 조회, 수정, 삭제 기능.
  - 주문 서비스와 **Kafka**를 통한 메시지 교환.
  - 유저 서비스와 **Feign Client**를 활용한 통신.

### 7. User Service
- **역할:** 유저 관리 시스템 구현.
- **기능:**
  - 유저 등록, 로그인, 권한 관리 기능.
  - JWT 기반 인증 및 보안 적용.
  - **Feign Client**를 통해 **Order Service** 및 **Catalog Service**와 통신.

---

## 실행 방법
1. **프로젝트 클론**
```
git clone <repository-url>
```
2. **서비스 실행**
각 서비스 디렉터리로 이동하여 실행:
```
cd discovery-server
./gradlew bootRun
```
```
cd apigateway-service
./gradlew bootRun
```
다른 서비스들도 동일하게 실행:
```
cd [service-name]
./gradlew bootRun
```

---

## 기술 스택
- **언어:** Java 17
- **프레임워크:** Spring Boot, Spring Cloud
- **서비스 등록 및 탐색:** Eureka Server
- **API Gateway:** Spring Cloud Gateway
- **메시지 브로커:** Apache Kafka
- **서비스 통신:** Feign Client
- **빌드 도구:** Gradle
- **보안:** JWT 인증
- **배포:** Docker (옵션)

---



