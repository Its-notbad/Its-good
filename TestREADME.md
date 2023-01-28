@@ -30,3 +30,21 @@ push 하면 올라간다고 하자.
다시 변경을 해보자
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