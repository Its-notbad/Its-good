# Its-good
this is test againg
test again
그럴수 있다고 생각해 테스트하기 어렵네
# 프로젝트 폴더 이동
$ cd {프로젝트 폴더}

# 복사한 Github 주소 등록
$ git remote add origin https://github.com/Its-notbad/Its-good.git

# branch 확인
$ git branch

# branch 이름 변경 master -> main
# github 기본 branch 이름이 master에서 main으로 변경됨
# 하지만 git의 기본 master이기 때문에 main으로 변경
$ git branch -m master main

# github 변경 정보 있는지 pull
$ git pull origin main --allow-unrelated-histories

# vs code에서 commit한 파일 repository에 push
$ git push -u origin main

# 다시 테스트 해보자
테스트가 안된다?
제대로 가져오나 보자.
push 하면 올라간다고 하자.

@@ -30,3 +30,21 @@ push 하면 올라간다고 하자.
다시 변경을 해보자
@ 어렵구나
push가 안되네 뭐냐....
3213123123
1234
다시 체크아웃 해보자
임시 브랜치를 만든다. 이때 head 는 생성 된 브랜치로 생성
기 생성 된 commit 된 항목에서 빠져나오게 된다
$ git checkout -b foo #(1)
$ git branch foo #(2)
$ git tag foo #(3)
git brach -d foo(브랜치명)
생성했던 commit 보고 복구하기
$ git reflog -2 HEAD # or
$ git log -g -2 HEAD

or 다른 방법으로는
git checkout master //head를 마스터로 옮긴다.
n번째 커밋상태를 유지하려면 master branch를 n번째 커밋을
참조하게 변경한다.
git branch -f master HEAD
head가 master branch를 참조하게끔 branch로 checkout
git checkout master