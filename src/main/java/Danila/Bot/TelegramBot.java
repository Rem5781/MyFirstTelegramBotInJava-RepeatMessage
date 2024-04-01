package Danila.Bot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class TelegramBot extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        return "ToWork7Bot";
    }

    @Override
    public String getBotToken() {
        return "7042027901:AAGPaEZQX4qvhZyQGTqvqcEQ2XiliIk4chU";
    }

    @Override
    public void onUpdateReceived(Update update) {

        String chatId = update.getMessage().getChatId().toString();
        String text = update.getMessage().getText();

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(text);

        try {
            this.execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }

    }
}
