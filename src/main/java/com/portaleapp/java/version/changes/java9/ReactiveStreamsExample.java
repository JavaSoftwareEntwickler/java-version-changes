package com.portaleapp.java.version.changes.java9;

import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

/**
 * Esempio di utilizzo di Reactive Streams in Java 9.
 * Reactive Streams API (Flow per la programmazione reattiva)
 */
public class ReactiveStreamsExample {
    public static void main(String[] args) {
        SubmissionPublisher<String> publisher = new SubmissionPublisher<>();

        publisher.subscribe(new MySubscriber());
        publisher.submit("Messaggio 1");
        publisher.submit("Messaggio 2");
        publisher.close();
    }
}

class MySubscriber implements Flow.Subscriber<String> {
    private Flow.Subscription subscription;

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        subscription.request(1);
    }

    @Override
    public void onNext(String item) {
        System.out.println("Ricevuto: " + item);
        subscription.request(1);
    }

    @Override
    public void onError(Throwable throwable) {
        System.err.println("Errore: " + throwable.getMessage());
    }

    @Override
    public void onComplete() {
        System.out.println("Tutti i messaggi ricevuti.");
    }
}
