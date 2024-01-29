## 🖥️ ketchby 소개

취미 아마추어들의 정식 클래스 오픈 및 성장을 돕는 웹사이트

## 🕛 개발 기간

✔️ 개발 기간 : 2023.07. ~ 2023.08(4주)


## 🧑‍🤝‍🧑멤버 구성

![image](https://github.com/hyunseo3/ketchby/assets/94173709/13c293fb-4810-40fd-9a50-ad2002dd213d)


## 👩‍💻개발 환경 

![image](https://github.com/hyunseo3/ketchby/assets/94173709/b8847e8a-9b7a-4572-92a6-fd4a2f99ddfa)


## 📖ERD 다이어그램
![image](https://github.com/hyunseo3/ketchby/assets/94173709/23cf3b60-af9f-408c-9c9b-7856efecd21d)


## 🖥️화면 구성 및 주요 기능
### 로그인 & 회원가입
---
![image](https://github.com/hyunseo3/ketchby/assets/94173709/f30b59ca-d902-4122-a5de-f7ac87dd2e0b) ![image](https://github.com/hyunseo3/ketchby/assets/94173709/f35b75b8-1a97-403c-83c5-69865c84ca33)

* Oauth, spring security를 이용하여 카카오 계정과 연동
* Mail API를 이용한 이메일 인증
* Ajax를 이용해 사용자가 입력한 아이디의 유무 확인


### 메인 페이지
---
![image](https://github.com/hyunseo3/ketchby/assets/94173709/713de85d-aa1d-457b-b8d9-4e103d7f500c)

* % 연산 사용, 마지막 슬라이드에서 다시 처음 순환 가능
* autoSlide 함수로 일정 시간마다 자동으로 슬라이드 변경 
* setInterval를 통해 3초마다 autoSlide 함수가 호출 
* 추천 클래스 : SQL 쿼리를 이용해 자신과 비슷한 취향의 회원 + 새로 가입시에는 인기 클래스 추천


### 클래스
---
1. 클래스 메인
   
![image](https://github.com/hyunseo3/ketchby/assets/94173709/57d3a82f-1e3f-4999-aef5-fab3da861083)

2. 클래스 상세
   
![image](https://github.com/hyunseo3/ketchby/assets/94173709/ead3d661-b7a1-4b5f-8487-1fdc57552d84)

3. 클래스 개설
   
![image](https://github.com/hyunseo3/ketchby/assets/94173709/9406e78c-385f-4440-8309-c0262bff8352)

* 검색, 카테고리별, 필터별로 조건에 맞는 카드 추출(updateQueryString)
* 카카오 API를 사용하여 위치를 지도에 표시
* Ajax를 이용하여 카테고리 대 분류 선택 시 대 분류에 속하는 소분류 카테고리 출력


### 예약/결제
---
![image](https://github.com/hyunseo3/ketchby/assets/94173709/72cfda05-7af9-4dd2-9d10-9ada2fe59a72)

![image](https://github.com/hyunseo3/ketchby/assets/94173709/a3686ccb-411a-48ad-9109-e84a76ef6408)
* JS를 통해 신청 가능한 날짜만 활성화
* Import 모듈을 이용하여 결제 기능 구현



### 마이페이지
---
![image](https://github.com/hyunseo3/ketchby/assets/94173709/2757b813-415d-4bde-8ca3-ab5ad96566f4)
* 로그인 세션을 불러와 게시물, 수강내역, 소모임 등 Ketchby에서의 활동 확인


### 공지사항
---
![image](https://github.com/hyunseo3/ketchby/assets/94173709/9b1917d1-902a-4d02-88f4-5885fcc4ecba)
* 관리자가 관리자 페이지에 작성한 공지사항만 출력 (Thymeleaf  for each문 사용)


### 커뮤니티

