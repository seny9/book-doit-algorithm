
# book-doit-algorithm
## ๐์ค๋น
### ์ฑ:  do it ์๋ฃ๊ตฌ์กฐ์ ํจ๊ป ๋ฐฐ์ฐ๋ ์๊ณ ๋ฆฌ์ฆ ์๋ฌธ:์๋ฐํธ
### ์งํ ์๊ฐ ๋ฐ ๋ฐฉ์
- ๋งค์ฃผ ์๋ชฉ 2์ ์งํ
- ๋งค ์คํฐ๋ ์ ๊น์ง ํ ์ฃผ์ฐจ ๊ณต๋ถํ ๊ฒ๊ณผ ์ฐ์ต๋ฌธ์   ๊นํ๋ธ์ ์๋ก๋
- ์คํฐ๋์์ ์ฐ์ต๋ฌธ์  ์์ฃผ ๋ฐํ์ ํน๋ณํ ๊ณต์ ํ๊ณ  ์ถ์ ๊ฒ ์ด๋ ค์ ๋ ๊ฒ ๊ณต์ 

### ๊นํ ๊ด๋ จ ์ฒ๋ฆฌ
- ๋งํฌ๋ค์ด ๋ด๋ณด๋ผ ๋ whitespace ์๋ฌ


![whitespace](https://user-images.githubusercontent.com/69182630/221115408-74c12499-3e35-4f3b-a18a-dfef2fdf8f36.png)
 - ๋ฆฌ๋์ค ์์คํ์ ์ค ๋์ด LF(Line Feed)๊ณ  ์๋์ฐ๋ CR(Carriage Return)๊ณผ LF์ธ CRLF๋ก ์ด๋ฃจ์ด์ง๊ธฐ ๋๋ฌธ์ ์๋ฌ๊ฐ ๋ฐ์ํ๋ค.

 <br>

 - ์๋์ฐ์์๋ CRLF ์ฌ์ฉํ๋ฏ๋ก ์ ์ฅ์์์ ๊ฐ์ ธ์ฌ ๋ LF๋ฅผ CRLF๋ก ๋ณ๊ฒฝ, ๋ค์ ๋ด๋ณด๋ผ ๋๋ CRLF๋ฅผ LF๋ก ๋ณ๊ฒฝ

 ```bash
 git config --global core.autocrlf true
 ```
 - ๋ฆฌ๋์ค๋ ์๋ LF๋ง ์ฌ์ฉํ๋ฏ๋ก ๊ทธ๋๋ก ์ฌ์ฉ
 ```bash
 git config --global core.autocrlf input
 ```
