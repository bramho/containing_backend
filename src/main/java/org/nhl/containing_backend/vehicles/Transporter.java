package org.nhl.containing_backend.vehicles;

import org.nhl.containing_backend.Container;
import org.nhl.containing_backend.exceptions.FullStackException;

import java.awt.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.EmptyStackException;

/**
 * Mass-transport vehicle that transports containers.
 */
public class Transporter extends Vehicle {

    public Transporter(int rowsCount, int columnsCount, int containerAmountLimit) {
        // Ignore the assignment error; it's stupid.
        this.containers = new ArrayDeque[rowsCount][columnsCount];

        // Instantiate all stacks in the 2D array.
        for (int row = 0; row < rowsCount; row++) {
            for (int column = 0; column < columnsCount; column++) {
                this.containers[row][column] = new ArrayDeque<Container>();
            }
        }

        this.containerAmountLimit = containerAmountLimit;
    }

    @Override
    public void putContainer(Point point, Container container) {
        super.putContainer(point, container);
    }

    @Override
    public Container takeContainer(Point point) {
        return super.takeContainer(point);
    }

    /**
     * Small utility function that returns the size of a stack at a given coordinate
     *
     * @param point 2D integer coordinate of a container stack on the transporter.
     * @return The amount of containers on the stack.
     */
    @Override
    public int heightAt(Point point) {
        return super.heightAt(point);
    }
}
