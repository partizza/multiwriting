package ua.agabry.multiwriting;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public abstract class AbstractProducer<T> implements Callable<Integer> {

    protected List<DataQueue<T>> queues = new ArrayList<>();

    public AbstractProducer(List<DataQueue<T>> queues) {
        if (queues == null) throw new IllegalArgumentException("Parameters can't be null.");
        this.queues.addAll(queues);
    }
}
