# 컴퓨터공학과 게시판

> 실제 이용자 : 실제로 사람들한테 공유해서 (에타)

## 기술 스택

> Back End : Spring Boot

> Front End : Vue.js

> DB : MySQL

> Server : Tomcat

## 구현할 것들

### 게시판

> 1. 과목 게시판
> 2. 알고리즘 게시판

### 게시물

> 1. 게시물 (글번호, 글쓴이, 시간, 추천)
> 2. 게시물 생성(도배 방지, upload), 수정 및 삭제(관리자만)
> 3. 게시물 내용 (글 제목, 글 내용 - 텍스트, 코드 , 사진)
> 4. 페이지네이션 구현
> 5. 검색 기능 구현

### 댓글

> 1.  댓글(글쓴이(IP), 시간, 추천), 대댓글 또는 태그 구현?

### 회원

> 1.  익명회원(IP), 관리자( 어떤식? )

### 프로젝트 기간 : 개강 전까지 배포

## Database에 따른 설정 사항

> pom.xml

MariaDB의 경우

```xml
<groupId>org.mariadb.jdbc</groupId>
<artifactId>mariadb-java-client</artifactId>
```

MySQL의 경우

```xml
<groupId>mysql</groupId>
<artifactId>mysql-connector-java</artifactId>
```

> src/main/resources/application.properties

MariaDB의 경우

```xml
spring.datasource.driver-class-name= org.mariadb.jdbc.Driver
spring.datasource.url=jdbc:mariadb://localhost:3306/hongcom_forum
```

MySQL의 경우

```xml
spring.datasource.driver-class-name= com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/hongcom_forum?serverTimezone=UTC&useSSL=false
```
