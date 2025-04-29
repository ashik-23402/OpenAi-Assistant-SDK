package org.com;

import org.com.api.AssistantService;
import org.com.model.Assistant;
import org.com.model.AssistantRequest;

public class OpenAiClient {

    private final String apiKey;
    private final AssistantService assistantService;

    public OpenAiClient(String apiKey) {
        this.apiKey = apiKey;
        this.assistantService = new AssistantService(apiKey);
    }

    public Assistant createAssistant(AssistantRequest request) throws Exception {

        return assistantService.createAssistant(request);
    }

    public Assistant updateAssistant(String assistantId, AssistantRequest request) throws Exception {

        return assistantService.updateAssistant(assistantId, request);
    }

    public Assistant retrieveAssistant (String assistantId) throws Exception {

        return assistantService.getAssistantById(assistantId);
    }

    public boolean deleteAssistant(String assistantId) throws Exception {

        return assistantService.deleteAssistant(assistantId);
    }
}
