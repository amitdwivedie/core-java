package com.amitdwivedie.core.thread;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Amit Dwivedi
 *
 */
public class WaitNotifyLoopExample {

    public static void main(String[] args) {
        Machine machine = new Machine();

        Operator operator1 = new Operator(machine);
        Operator operator2 = new Operator(machine);
        Operator operator3 = new Operator(machine);

        operator1.start();
        operator2.start();
        operator3.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        machine.start();
    }
}

class Operator extends Thread {

    private Machine machine;

    public Operator(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void run() {
        while (true) {
            Shape shape = getShapeFromUser();
            MachineInstruction machineInstruction = CalculateNewInstructionForShape(shape);
            machine.addJob(machineInstruction);
        }
    }

    private MachineInstruction CalculateNewInstructionForShape(Shape shape) {

        return new MachineInstruction(shape);
    }

    private Shape getShapeFromUser() {
        return new Shape("Square");
    }

}

class Machine extends Thread {

    List<MachineInstruction> machineInstructions = new ArrayList<MachineInstruction>();

    @Override
    public void run() {
        while (true) {
            synchronized (machineInstructions) {
                while (machineInstructions.isEmpty()) {
                    try {
                        machineInstructions.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                machineInstructions.remove(0);
                System.out.println("Job executed successfully...");
            }
        }
    }

    public void addJob(MachineInstruction machineInstruction) {
        synchronized (machineInstructions) {
            machineInstructions.add(machineInstruction);
            System.out.println("Job added...");
            machineInstructions.notify();
        }
    }

}

class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

class MachineInstruction {
    private Shape shape;

    public MachineInstruction(Shape shape) {
        this.shape = shape;
    }

    public void getInstructionForShape() {
        System.out.println("Instruction for shape " + shape.getName());
    }
}