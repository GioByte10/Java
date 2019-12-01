

public class Program{
	
	
	public static void main (String []args) {
		
boolean out = false;
char x = 'i';

		
		String words = "Absolute Zero, Acceleration, Accuracy, Acoustics, Action, Adhesion, Affect, Alteration, Amplitude, Angular, Antiproton, Apparent, Applied, Apply, Aptitude, Aristotle, Aspect, Atmosphere, Atom, Atomic, Attenuate, Attraction, Aviation, Axis\r\n" + 
				"Balance, Basic, Bodies, Boson, Branch\r\n" + 
				"Calculus, Capacity, Centrifugal, Changes, Chaos, Charge, Chemical, Chromatics, Circular, Collide, Component, Compression, Condensation, Conductivity, Conservation, Constant, Control, Conversion, Copernicus, Cosmology, Curie\r\n" + 
				"Damping, Decibel, Density, Dependence, Deposits, Design, Development, Deviation, Diode, Direction, Discipline, Displacement, Distance, Distortion, Disturbance, Doctorate, Drag, Dynamics\r\n" + 
				"Effect, Einstein, Elasticity, Electricity, Electromagnetic, Electron, Electronics, Emission, Energy, Engine, Engineer, Entropy, Equation, Equilibrium, Equivalent, Evaporation, Expansion, Experiment, Explosion, External\r\n" + 
				"Factor, Fission, Flight, Flow, Fluid, Flying, Focus, Force, Form, Formula, Frequency, Friction, Fulcrum, Fundamental\r\n" + 
				"Galileo, Gas, Generate, Geophysics, Gilbert, Graph, Gravitation, Gravity, Guide, Gyroscope\r\n" + 
				"Half-life, Harness, Heat, Hertz, Hold, Hydraulics\r\n" + 
				"Identical, Impact, Impulse, Incandescent, Inertia, Influence, Innovate, Inquiry, Interaction, Intervening, Invention, Inverse, Investigation, Invisible, Irradiate, Isotope\r\n" + 
				"Joule\r\n" + 
				"Kaon, Kinetics\r\n" + 
				"Laser, Laws, Level, Lift, Light, Liquids, Loft, Lumen\r\n" + 
				"Machinery, Magnet, Magnetism, Magnitude, Mass, Mathematics, Matter, Measure, Mechanics, Meteorology, Metrics, Modulate, Molecule, Motion, Movement\r\n" + 
				"Navigation, Negative, Newton, Nuclear, Nucleus\r\n" + 
				"Objects, Optics, Oscillation, Overload\r\n" + 
				"Parallax, Parity, Particle, Performance, Phenomenon, Photon, Piston, Pitch, Plasma, Position, Prediction, Pressure, Principal, Projectile, Propagation, Properties, Proportion, Psi, Pulse\r\n" + 
				"Quality, Quandary, Quanta, Quantitative, Quantity, Quantum, Quark\r\n" + 
				"Radiation, Radioactivity, Reception, Relationship, Relative, Relativity, Repulsion, Research, Resistance, Resolution, Resonance, Rest, Reversal, Robotic, Rotation\r\n" + 
				"Saturation, Scalar, Science, Scientific, Seismology, Semiconductor, Shape, Shift, Newton, Solid, Sonic, Sound, Space, Spectrum, Speed, Standing, Stationary, Statistics, Strain, Stress, Structure, Study, Sublimation, Substance, Surface, Suspension, Symmetry, System\r\n" + 
				"Temperature, Tensile, Tension, Theoretical, Theory, Thermal, Thermodynamics, Thrust, Torque, Training, Trajectory, Transformation, Transistor, Transition, Trough, Turning\r\n" + 
				"Ultrasonic, Uncertainty, Uniform, Unify, Unique, Unit, Universal, University\r\n" + 
				"Vacuum, Value, Vapor, Variable, Variation, Vector, Velocity, Viscosity, Volatile, Voltage, Volume\r\n" + 
				"Wave, Weight, White noise\r\n" + 
				"X-ray\r\n" + 
				"Zone";

		
		String newS = "";
		String[] list = new String[500];
		
		int len = 0, i = 0;
		
for(i = 0; i < words.length(); i++) {
			
			if(!(words.charAt(i) == ',' || words.charAt(i) == ' ' || words.charAt(i) == '\n' || words.charAt(i) == '\r')) {
				
				newS += words.charAt(i);
				
			}
		}
			
			for(int j = 0; j < list.length; j++) {
				
				
				for(i = len + 1; i < newS.length(); i++) {
					
					
					if(Character.isUpperCase(newS.charAt(i))) {
						//System.out.println(i);
						break;
						
						
					}
					
					if(i == newS.length() - 1) {
						out = true;
						break;
					}
					
					
					
					
				}
				
				if(out)
				    list[j] = newS.substring(len, newS.length());
				else
					list[j] = newS.substring(len, i);
				
				len += list[j].length();
				
				//System.out.println(list[j]);
				
				if(out)
					break;
				
			}
			
			for(i = 0; list[i] != null; i++) {
				
				System.out.println(i + "   " + list[i]);
				
			}
			
			
		}
		
		
		
		
		
	}
	
