<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>채팅</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            list-style-type: none;
            text-decoration: none;
            font-family: 'Noto Sans KR', sans-serif;
            font-size: 1em;
            font-weight: 300;
            color: #000;
        }

        body {
            width: 100%;
            height: auto;
            background-color: #367FFF;
            /* body에 스타일링을 지양해주십시오. */
        }
        /*채팅창 구현*/
        .send {
            float: right;
        }

        .recieve {
            float: left;
        }

        .chat {
            clear: both;
            width: 90%;
            height: auto;
            margin: 0 auto;
        }
        
        .my-chat-content {
            width: 100%;
            min-height: 280px;
            margin: 10px 0 10px 0;
            background-color: whitesmoke;
        }

        .chat-input {
            width: 80%;
            float: left;
        }

        #chat-content {
            width: 100%;
            height: 100px;
        }
        #chatBtn {
            width: 40px;
            margin: 40px 0px 40px 15px;
            float: right;
        } 
    </style>
    <script src="js/jquery-1.12.4.min.js"></script>
    <script>
    	var ws = new WebSocket("ws://localhost:8080/replyEcho?bno=1234")
    	
    	ws.onopen = function () {
			console.log('Info: connection opened.');
			setTimeout( function(){ connect(); }, 1000); // 타임아웃시 커넥션 재시도 
		};
		
		ws.onmessage = function (event) {
			console.lg(event.data+'\n');
		}
		
		ws.onclose = function (event) { console.log('Info: connection closed.'); };
		ws.onerror = function (event) { console.log('Info: connection closed.'); };
		
		$('#chatBtn').on('click', function (evt) {
			evt.preventDefault();
			if (socket.readyState !== 1) return;
				let msg = $('input#chat-content').val();
				ws.send(msg);
		})
			
		}
    </script>
</head>

<body>
    <div class="chat">
        <div class="my-chat-content">
            <div class="send">
                나 : 웅애웅ㅇ
                <br><br>
            </div>
            <div class="recieve">
                상대방 : 웅앵웅 우앵웅ㅇ 맥앤치즈줘
                <br><br>
            </div>
        </div>
        <form action="/미정" method="post">
        <div class="chat-input-wrapper">    
            <div class="chat-input">
                <textarea id="chat-content" type="text" name="chat_input"></textarea>
            </div>
            <input class="chat-input" id="chatBtn" type="button" value="전송">
        </div>
        </form>
    </div>
</body>

</html>