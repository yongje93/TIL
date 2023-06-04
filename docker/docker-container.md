## Docker Container 실행하기

- - -

### 도커 엔진 시작/종료

```bash
# 도커 엔진 시작
sudo systemctl start docker

# 도커 엔진 종료
sudo systemctl stop docker

# 자동 실행 설정
sudo systemctl enable docker
```

- - -

### 컨테이너의 기본 사용 방법

#### 명령어와 대상
docker 명령어 뒤에 오는 '무엇을', '어떻게'에 해당하는 부분을 커맨드  
커맨드는 상위 커맨드 + 하위 커맨드로 구성  

```bash
# docker + 커맨드(상위/하위커맨드) + 대상
docker container run penguin
```

#### 옵션과 인자
docker 명령어에는 '옵션', '인자'라는 추가 정보가 붙는다
container run 커맨드에 -d 라는 옵션을, penguin을 대상으로 --mode=1 이라는 인자를 붙일 수 있다

```bash
docker container run -d penguin --mode=1
```

- - -

### 컨테이너의 생성과 삭제, 실행, 정지

#### 컨테이너를 생성하고 실행하는 커맨드

docker run 명령어는 docker image pull, docker container create, docker container start 의 기능을 하나로 합침

```bash
docker run [옵션] [이미지] [인자]

docker image pull + docker container create + docker container start
```

#### 컨테이너를 정지하는 커맨드

```bash
docker stop [컨테이너 이름]
```

#### 컨테이너를 삭제하는 커맨드

```bash
docker rm [컨테이너 이름]
```

#### docker ps 커맨드
컨테이너의 목록을 출력하는 기능

```bash
docker ps
docker container ls
```

컨테이너 목록 정보
- CONTAINER ID : 컨테이너 식별자
- IMAGE : 컨테이너를 만들 때 사용한 이미지 이름
- COMMAND : 컨테이너 실행 시 실행하도록 설정된 프로그램 이름
- CREATED : 컨테이너 생성 후 경과된 시간
- STATUS : 컨테이너의 현재 상태 (Up, Exited)
- PORTS : 컨테이너에 할당된 포트 번호 (호스트 포트 번호/컨테이너 포트 번호) 형식
- NAMES : 컨테이너 이름




