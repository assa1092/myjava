package chap09.exercises.Ex06;

public class Chatting {
	void startChat(String chatId) {
		String nickName = chatId;
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					String inputData = "안녕하세요.";
					String message = "["+ nickName + "]" + inputData;
					sendMessage(message);
				}
				
			}
			@Override
			void sendMessage(String message) {
				// TODO Auto-generated method stub
				super.sendMessage(message);
			}
		};
		chat.start();
				
	}
	
	
	class Chat {
		void start() {}
		void sendMessage(String message) {}
	}

}
